package marianaEstephany;

import java.util.List;

public class Fachada {
	
	//Aprova cadastro de usu�rio	   
    public void aprovarCadastoUsuario(Usuario u){
    }

    //submete cadastro de usu�rio para aprova��o
    public void cadastrarUsuario(Usuario u){
    }
    //Cadastra administrador
    public void cadastrarAdministrador(Administrador a){
    }
    
    public void eliminarMaterialImproprio(Artigo artigo){
    }

    //Adiciona artigo mas n�o deixa publico
    public void adicionarArtigo(Artigo artigo){
    }
    //remove artigo
    public void removerArtigo(Artigo artigo){
    }

    //faz pesquisa a partir do nome do autor
    public Artigo pesquisarPorAutor(String autor){
    return null;
    }
    //pesuqisa artigo por palvras
    public Artigo pesquisarArtigoPorPalavra(String palavra){
    return null;
    }

    //pesquisa artigo por titulo
    public Artigo  pesquisarArtigoPorTitulo(String titulo){
    return null;
    }
    // retorna uma lista com todos artigos compartilhados
    public List pesquisarMateriaisCompartilhados(){
    return null;
    }

    //compartilha arquivo
    public void compartilharMaterial(Artigo artigo ){
    }

}
