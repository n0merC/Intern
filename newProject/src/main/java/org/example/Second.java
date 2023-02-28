package org.example;

@Component
public class Second {
    @Autowired()
    public Second(){
        System.out.println("Second");
    }
}
