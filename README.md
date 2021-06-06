# AtividadeDeProjetoDeProgramacao
Atividade da disciplina Projeto de Programação (3º período de S.I.)

Desenvolver, usando Java com Spring, uma API com base no diagrama que permita
cadastrar, listar, apagar e atualizar os dados, armazenando os dados em banco de dados h2.
A API deve ser disponibilizada no Heroku e o código no Github.
O aluno deve encaminhar o link do heroku e do github (Este deve ser público)
O controlador deve estar para o endereço /curso

### Diagrama de classe para o CRUD

| Curso  |
| ------------------- |
| id: int |
| nome: string |
| descricao: string |
| ementa: string |
| dataCadastro: Date |
| dataInicio: Date |
| valor: float |

### Configuração do H2

DATASOURCE
spring.datasource.url=jdbc:h2:file:./data/exemplo
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

JPA
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
