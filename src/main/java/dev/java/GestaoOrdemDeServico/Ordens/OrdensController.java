package dev.java.GestaoOrdemDeServico.Ordens;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ordens")
public class OrdensController {

    private final OrdensService ordensService;

    public OrdensController(OrdensService ordensService) {
        this.ordensService = ordensService;
    }

    //Creat
    @PostMapping("/criar")
    public OrdensModel criarOrdem (OrdensModel ordensModel){
        return ordensService.criarOrdem(ordensModel);
    }
    //Read
    @GetMapping("/Listar")
    public List<OrdensModel> listarOrdens (){
        return ordensService.listarOrdens();
    }

    @GetMapping("/Listar/{id}")
    public OrdensModel listarOrdemId (@PathVariable Long id){
        return ordensService.listarOrdensId(id);
    }


    //Update
    @PutMapping("/atualizar/{id}")
    public OrdensModel atualizarOrdem (@PathVariable Long id, @RequestBody OrdensModel ordensModel){
        return ordensService.atualizarOrdem(id, ordensModel);
    }

    //Delete
    @DeleteMapping("/apagar/{id}")
    public String apagarOrdem (OrdensModel ordensModel){
        return "Ninja Apagado";
    }

}
