# Lista de Exercícios de Arquivos 2 - Sistemas Operacionais 1

<div align="center">
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Windows](https://img.shields.io/badge/Windows-000?style=for-the-badge&logo=windows&logoColor=2CA5E0)

</div>

## Sobre o projeto
Este projeto contem a lista 2 de exercícios, sobre arquivos e diretórios, da materia de Sistemas Operacionais 1 do curso de Análise e desenvolvimento de sistemas da FATEC Zona Leste.<br>

## Índice
=================
<!--ts-->
* [Título](#lista-de-exercícios-de-arquivos-2--sistemas-operacionais-1)
* [Sobre o Projeto](#sobre-o-projeto)
* [Índice](#índice)
* [Exercícios](#exercícios)
* [Status do projeto](#status-do-projeto)
* [Tecnologias](#tecnologias)
* [Agradecimentos](#agradecimentos)
* [Autor](#autor)
<!--te-->

## Exercícios
1) Diversas estruturas de dados são utilizadas nas funcionalidades dos sistemas operacionais, como ilhas,
Listas, Árvores, Filas, etc. Maiores informações serão dadas abaixo.<br>
Pensando nisso, a atividade consiste em pegar o arquivo csv em anexo e criar um projeto Java para
manipulá-lo. O csv em questão apresenta todas as características de todos os jogadores disponíveis no jogo FIFA
‘19 da Eletronic Arts. O arquivo está com jogadores ordenados por seu Overall, do maior para o menor, portanto,
o primeiro jogador da lista é o Leonel Messi, Overall 94 e o último é G. Nugent, com Overall 46.
O arquivo data.csv deve ser colocado na pasta `C:\TEMP`
O projeto deverá conter:<br>
`package controller`
- IFifaController (Interface)
  - A interface deve conter as seguintes operações: <br>
    - `public Pilha<String> empilhaBrasileiros(String caminho, String nome) throws IOException`<br>
    - `public void desmpilhaBonsBrasileiros(Pilha<String> pilha) throws IOException` <br>
    - `public Lista<String> listaRevelacoes(String caminho, String nome) throws IOException` <br>
    - `public void buscaListaBonsJovens(Lista<String> lista) throws IOException` <br> 
- FifaController (Classe que implementa a interface IFifaController)<br>

`package view`<br>
- Principal (Classe com main)<br>

O método `empilhaBrasileiros` recebe o caminho e o nome do arquivo, deverá inicializar uma pilha, abrir o arquivo,
ler o arquivo, verificar se na coluna referente à nacionalidade existe o valor “Brazil” e empilhar (push) a linha
inteira, apenas de jogadores brasileiros. O método deve retornar essa pilha.<br>
O método `desempilhaBonsBrasileiros` deve receber uma pilha de Strings como parâmetro, percorrer a pilha,
desempilhar (pop) e imprimir (somente nome e Overall) apenas de jogadores com Overall acima de 80. Perceba
que, como estão ordenados, no arquivo, do melhor para o pior, os jogadores serão empilhados do melhor para o
pior, portanto, o primeiro impresso deverá ser o pior dentre os escolhidos e o último deverá ser Neymar Jr, com
Overall 92.<br>
O método `listaRevelacoes` recebe o caminho e o nome do arquivo, deverá inicializar uma lista encadeada, abrir o
arquivo, ler o arquivo, verificar se na coluna referente à idade o valor é menor ou igual a 20, e adicionar ao final da
lista, a linha inteira, apenas de jogadores jovens. O método deve retornar essa lista.<br>
O método `buscaListaBonsJovens` deve receber uma lista de Strings como parâmetro, percorrer a lista do último
para o primeiro, imprimir (somente nome, idade e Overall) apenas de jogadores com Overall acima de 80 e 20
anos ou menos.<br>

Database: https://drive.google.com/file/d/1aQ0enV7OzclT1RbQh4tzkQlEuxFbXzjt/view?usp=sharing

* Considere que, para separar cada elemento de cada linha, deve se usar o método split;<br>
* Considere que a primeira linha do arquivo deve ser ignorada
<hr>

2) Fazer uma aplicação em Java que tenha uma classe de controle que contenha um método que receba um
String com um caminho de diretório, faça as validações, e liste apenas os arquivos contidos, em ordem de
tamanho (em MB). Para obter o tamanho do arquivo, pegar o `double length()` do `File`, que retorna o tamanho do
arquivo em bytes.<br>
* Lembrando 1 MB = ((bytes / 1024) / 1024)

## Status do projeto
  ✅Finalizado✅
* Total de exercícios: 2
* Exercícios completos na versão atual: 2

## Tecnologias
- [Java](https://www.oracle.com/br/java/)
  - [File](https://docs.oracle.com/javase/8/docs/api/java/io/File.html)
  - [FileInputStream](https://docs.oracle.com/javase/8/docs/api/java/io/FileInputStream.html)
  - [InputStreamReader](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html)
  - [BufferedReader](https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html)
  - [StringBuffer](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html)
  - [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html?is-external=true)
  - [JOptionPane](https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html)

- [Git](https://git-scm.com) 

## Agradecimentos
Agradeço ao professor da disciplina de Sistemas Operacionais 1, [Leandro Colevati dos Santos](https://www.leandrocolevati.com.br/index.jsp), por todo o aprendizado passado.

## Autor

<div align="center">
  <a href="https://www.linkedin.com/in/thiago-antenor/">
  <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/99970279?v=4" width="100px;" alt="foto do autor"/>
   <br />
   <sub><b>Thiago Silva Antenor</b></sub></a> <a href="https://www.linkedin.com/in/thiago-antenor/" title="Linkedin"> 🧑🏾‍💻</a>
  
  
  Feito por Thiago Silva Antenor 👨🏾‍💻 Entre em contato!
  
  [![Linkedin Badge](https://img.shields.io/badge/-Thiago-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/thiago-antenor/)](https://www.linkedin.com/in/thiago-antenor/) 
  [![Gmail Badge](https://img.shields.io/badge/-thiagoantenor31@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:thiagoantenor31.com)](mailto:thiagoantenor31.com)
</div>
