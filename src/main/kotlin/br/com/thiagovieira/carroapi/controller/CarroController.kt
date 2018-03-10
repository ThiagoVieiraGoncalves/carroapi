package br.com.thiagovieira.carroapi.controller

import br.com.thiagovieira.carroapi.entity.Carro
import br.com.thiagovieira.carroapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")
class CarroController{

    @Autowired
    lateinit var carroService : CarroService

    @GetMapping
    fun buscarTods(): List<Carro>{
        return carroService.buscarTodosCarros()
    }


    @PostMapping
    fun salvar(@RequestBody carro: Carro){
        carroService.salvar(carro)
    }
}