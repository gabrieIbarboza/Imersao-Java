# Imersão Java ☕ - Alura #

<p>
  <a href="https://www.alura.com.br/imersao-java"><img src="https://www.alura.com.br/assets/img/imersao-java/imersao-logo.1676983691.svg" alt="Imersao-java"></a>
</p>


## Dia 01: ##


Buscar dados de filmes na API do site https://www.imdb.com para os melhores rankeados na aplicação. <br>

Links alternativos da API:
<br>
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopMovies.json
<br>
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/TopTVs.json
<br>
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularMovies.json
<br>
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/MostPopularTVs.json

### Desafios

1- ✔️ Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.

2- ✔️ Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI.

3- Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente.


## Dia 02: ##


Criamos o `StickerGenerator.java` para gerar figurinhas por código com os dados da API.

### Resultados

<p align="center">
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/IMDB/1_StrangerThings.png" width="200" height="287"/>
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/IMDB/2_TheBoys.png" width="200" height="287"/>
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/IMDB/3_TheTerminalList.png" width="200" height="287"/>
</p>

### Desafios

1- ✔️ Criar diretório de saída das imagens, se ainda não existir.

2- ✔️ Centralizar o texto na figurinha.

3- Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.

4- Colocar contorno (outline) no texto da imagem.

5- ✔️ Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha.


## Dia 03: ##

Dia de fazer melhoras e refatorações no código para torná-lo mais flexível e fácil de entender (OOP).
<br>
Fizemos conexão com a API da NASA para gerar figurinhas mais incríveis!

Links alternativos da API da NASA:
<br>
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD.json
<br>
https://raw.githubusercontent.com/alura-cursos/imersao-java-2-api/main/NASA-APOD-JamesWebbSpaceTelescope.json

### Resultados
<p align="center">
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/NASA/1_FindtheManintheMoon.png" width="280" height="236"/>
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/NASA/2_MTheWhirlpoolGalaxyfromHubble.png" width="280" height="236"/>
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/NASA/3_SatellitesBehindPinnacles.png" width="280" height="236"/>
</p>

### Desafios
1- Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16.

2- Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP.

3- Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra.

4- Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado.


## Dia 04: ##


Criei minha própria API chamada BarbozaFirstAPI (BARB) usando Spring e MongoDB.
<br>
Integrei ela ao projeto original para gerar stickers realmente customizados de The Last Of Us (pois foi o que cadastrei na API).
<br>

### Resultados
<p align="center">
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/BARB/1_Joel.png" width="280" height="236"/>
  <!--<img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/BARB/2_Ellie.png" width="280" height="236"/>-->
  <img src="https://raw.githubusercontent.com/gabrieIbarboza/Imersao-Java/master/output/BARB/3_TLOUdaGlobo" width="280" height="236"/>
</p>

### Desafios
1 - Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada.

2 - Devolver a listagem ordenada por ordem algabética.

3 - Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST.


## Dia 05: ##
`Coming soon...`
