package br.com.fecaf.controller;

import br.com.fecaf.model.Livro;
import br.com.fecaf.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501", allowedHeaders = "*")
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    // Endpoint para listar os Livros
    @GetMapping("/listarLivros")
    public List<Livro> listarLivros() {
        return livroService.listarLivro();
    }


    // Endpoint para cadastrar um novo Livro
    @PostMapping("/cadastrarLivros")
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {
        Livro newLivro = livroService.cadastrarLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLivro);
    }


    // Endpoint para editar um livro existente
    @PutMapping("/editarLivro/{id}")
    public ResponseEntity<Livro> editarLivro(@PathVariable Integer id, @RequestBody Livro livro) {
        Livro livroAtualizado = livroService.editarLivro(id, livro);

        if (livroAtualizado != null) {
            return ResponseEntity.ok(livroAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    // Endpoint para deletar um livro
    @DeleteMapping("/deletarLivro/{id}")
    public ResponseEntity<Void> deletarLivro(@PathVariable int id) {
        livroService.deletarLivro(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
