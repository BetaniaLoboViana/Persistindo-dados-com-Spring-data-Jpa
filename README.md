# 🚀 Spring Boot + JPA – Bootcamp DIO & Avanade

Este projeto foi desenvolvido como parte do **Bootcamp da DIO em parceria com a Avanade**, onde explorei conceitos fundamentais do **Spring Boot** e **Spring Data JPA**.

## 📌 Tecnologias Utilizadas
- **Java 17+**  
- **Spring Boot**  
- **Spring Data JPA**  
- **H2 Database** (Banco de dados em memória para testes)  
- **Maven**  

## 🔥 O que foi aprendido?
✅ **Configuração do projeto** com **Spring Initializr**  
✅ **Criação de entidades** e uso do **JPA** para persistência de dados  
✅ **Uso de repositórios do Spring Data JPA** para facilitar operações no banco  
✅ **Execução de consultas no banco** de maneira simples e eficiente  

## ⚙️ Como funciona?
1. O projeto inicializa uma aplicação Spring Boot.  
2. Um usuário é criado e salvo no banco de dados.  
3. Todos os usuários cadastrados são listados no console.  

## 🖥️ Trecho de Código
```java
@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private userrepository repository;

    @Override
    public void run(String... args) throws Exception {
        user user = new user();
        user.setName("Peter Rhae");
        user.setUsername("Foyet");
        user.setPassword("omnivore418");

        repository.save(user);
        for(user u: repository.findAll()){

        System.out.println(u);
    } 
    }
}
```



#SpringBoot #Java #JPA #SpringDataJPA #Backend #DIO #Avanade
