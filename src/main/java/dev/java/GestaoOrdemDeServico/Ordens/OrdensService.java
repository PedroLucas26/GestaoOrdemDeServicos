package dev.java.GestaoOrdemDeServico.Ordens;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrdensService {

    private final OrdensRepository ordensRepository;

    public OrdensService(OrdensRepository ordensRepository) {
        this.ordensRepository = ordensRepository;
    }

    //create
    public OrdensModel criarOrdem(OrdensModel ordensModel) {
        ordensRepository.save(ordensModel);
        return ordensModel;
    }

    //read
    public List<OrdensModel> listarOrdens() {
        return ordensRepository.findAll();
    }

    //read
    public OrdensModel listarOrdensId(Long id) {
        Optional<OrdensModel> OrdemPorId = ordensRepository.findById(id);
        return OrdemPorId
                .orElse(null);
    }

    //update
    public OrdensModel atualizarOrdem(Long id, OrdensModel ordensAtualizada) {
        Optional<OrdensModel> ordemPorId = ordensRepository.findById(id);
        if (ordemPorId.isPresent()) {
            ordensAtualizada.setId(id);
            ordensAtualizada = ordensRepository.save(ordensAtualizada);
            return ordensAtualizada;
        }
        return null;
    }

    //delete
    public void apagarOrdem(Long id) {
        ordensRepository.deleteById(id);
    }


}
