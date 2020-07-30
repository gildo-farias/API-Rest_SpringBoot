# API Rest Back-end(Biblioteca)

    API Rest usando SpringBoot, SpringBootDevTools, SpringMVC, SpringJPA Hibernate(PostgreSQL).
- **NOTA:** Front-end ainda não está acessando a este back-end, por enquanto usando apenas o [POSTMAN](https://www.postman.com/downloads/) para fazer os testes desta API Rest.

- Dados para testes de requisição:
```
    *** /Livro ***
{
    "isbn": "123ASD5487Q987",
    "genero": "FANTASIA",
    "titulo": "Harry Potter",
    "subTit": "O Prisioneiro de Azkaban",
    "autor": "J.K. Rowling",
    "ano": 2005,      
    "locado": false         
}
    *** /Cliente ***
{
    "cpf": "58797849720",  
    "nome": "BRUNO",
    "snome": "CORDEIRO",
    "email": "bruno@gmail.com",
    "telefone": "88981235644",
    "debito": 0,
    "status": true
}
```
    
## Front-end
 [Biblioteca Angular](https://github.com/gildo-farias/Angular_NodeJS). 
    
## Prerequisites
 - Eclipse IDE. 
 - PostgreSQL.
 
## Get Started
 1. Clone the Project or Download ZIP project(unzip this). 
 2. Open Eclipse, `File/Import/Maven/Existing Maven Projects`, Choose the clone directory.
 3. Run Application `ApirestApplication`.
 
## Base de Dados (PostgreSQL)
    DATABASE = BibliotecaDB

