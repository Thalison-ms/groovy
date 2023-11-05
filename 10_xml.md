XML Handling
```
import groovy.xml.MarkupBuilder
```

•	Aqui é importado uma classe do Groovy que chama-se MarkupBuilder
•	Com essa classe podemos gerar em código XML
•	O MarkupBuilder nos permite fazer uma sequência de chamadas de alguns métodos, onde método representa o nó e esse método recebe uma MAP como parâmetro
•	Cada MAP representa os atributos do nó em questão
```
def out = new File('C:\\Users\\Dev07\\Desktop\\Groovy Thalison\\arquivos\\devmediapublications.xml')
```
•	Define uma variável out que armazena o arquivo que representa o arquivo xml
```
def writer = new FileWriter(out)
```
•	Define uma variável
•	Basicamente depois que é criado o arquivo, ele será associado a uma instancia de classe FileWriter que nos permite gravar o conteúdo gerado pelo nosso código dentro do arquivo xml
```
def xml = new MarkupBuilder(writer)
```
•	Uma vez que o arquivo e o FileWriter estão instanciados ao arquivo, writer é associado ao MarkupBuilder passando como parâmetro
```
xml.publications(){
        publication(title:'Introduction to JavaServer Faces', year:2006){
            author(){
                    author('Rogerio Pereira Araujo')
            }
        }
        publication(title:'JavaServer Faces Validators', year:2007){
            authors(){
                author('Rogerio Pereira Araujo')
            }
        }
        publication(title:'Introduction to Groovy', year:2007){
            authors(){
                    author('Rogerio Pereira Araujo')
            }
        }
}
```
•	xml.publications representa o MarkupBuilder
•	O MarkupBuilder nos permite que seja possível fazer a chamadas a vários métodos
•	Cada método pode receber uma MPA e uma Closure como parâmetro
•	O método principal seria publications que representa o nó principal
•	Dentro desse método estamos passsando uma Closure que representa mais 3 métodos que são os publication
•	E cada um desses 3 métodos possui dois atributos que são title e year, representado pela entrada depois dos :
•	Cada um desses métodos também possui uma Closure como parâmetro
•	Essa Closure chama outro método chamada authors
•	Esse método não possui atributos, porém possui nós filhos que seria o nó author que possui um único argumento

## Leitura de um XML

```
def xml = new XmlSlurper().parse(new File('C:\\Users\\Dev07\\Desktop\\Groovy Thalison\\arquivos\\devmediapublications.xml'))
```
•	Define uma variável chamada XML
•	Vai receber a instancia de um objeto chamada Gpath que é gerado a partir do momento que informamos new XmlSluper()
•	.parse é um método que recebe um parâmetro, que no caso seria o arquivo devmediapublication.xml que contém o código XML
•	Uma vez que esse arquiv o é aberto e é instanciado pelo XmlSlurper, ou seja, quando finaliza o processo de .parse e é constatado que o xml está bem formado, está correto, esse método .parse retorna uma instancia do Gpath que será associadaa variável XML
•	Feito isso, podemos acessar todos os nós dentro do conteúdo xml através de expressões Gpath
```
def publications = xml.publication
```
•	Esse é um método de como acessar um conteúdo xml através de expressões Gpath
•	Aqui definimos uma variável chamada publications
•	Essa variável está recebendo uma lista de nós publication que está dentro do coteúdo XML
•	Uma vez que esses nós são armazenados na variável publications, então essa variável se torna uma coleção de nós publications
```
publications.each{
println "Publication: ${it.@title}"
println "Year: ${it.@year}"
        it.authos.each{
                println "  Author: ${it.text()}"
                }
                println""
}
```
