package br.com.fecaf.services;

import br.com.fecaf.model.Livro;
import br.com.fecaf.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;


    // Metodo para Listar Livros
    public List<Livro> listarLivro() {
        return livroRepository.findAll();
    }


    // Metodo para salvar/criar novo Livro
    public Livro cadastrarLivro(Livro livro) {
        return livroRepository.save(livro);
    }


    public Livro editarLivro(Integer id, Livro livro) {
        Optional<Livro> livroExistente = livroRepository.findById(id);

        if (livroExistente.isPresent()) {
            Livro livroAtualizado = livroExistente.get();
            livroAtualizado.setIsbn(livro.getIsbn());
            livroAtualizado.setTitulo(livro.getTitulo());
            livroAtualizado.setAutor(livro.getAutor());
            livroAtualizado.setGenero(livro.getGenero());
            livroAtualizado.setData_lancamento(livro.getData_lancamento());
            livroAtualizado.setSinopse(livro.getSinopse());
            livroAtualizado.setFoto(livro.getFoto());
            return livroRepository.save(livroAtualizado);
        } else {
            return null;
        }
    }

    //Metodo para Deletar Livro
    public void deletarLivro(int id) {
        livroRepository.deleteById(id);
    }
}
