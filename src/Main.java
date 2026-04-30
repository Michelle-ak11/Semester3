import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("WELCOME TO SPRING FRAMEWORK");
        System.out.println("Pick a number");
        System.out.println("====================================");
        System.out.println("1. Spring CORE");
        System.out.println("2. Spring WEB CONTEXT");
        System.out.println("3. Spring APPLICATION CONTEXT");
        System.out.println("4. Spring MVC");
        System.out.println("5. Spring AOP ");
        System.out.println("6. Spring Web ORM");
        System.out.println("7. Spring DAD");

        int option = scanner.nextInt();


        switch (option) {
            case 1:
                System.out.println(" CORE\n  1)Provides the fundamental functionality of the spring frame work. \n " +
                        "2) Contains the most important component of the spring framework, the bean factory container. \n" +
                        "3)Requires you to use the : org.springFramework.core package within your web application \n" +
                        "4) Applies DI to separate the object initialization, creation, and access from the actual application code.");
                break;

            case 2:
                System.out.println("Web Context\n 1) Is a part of its web application development stack which also includes the MVC module \n " +
                        "2) Requires you to use the org.springFramework.web package within your web application\n" +
                        "3) Is built on top of the application context for creating Web-based applications.\n" +
                        "4) Supports integration of the Spring framework with various frameworks, such as struts, WebWork, and JSF");
                break;

            case 3:
                System.out.println("Application Context\n" +
                        "1) Is built on top of the core module and provides you with the ability to obtain application resources \n" +
                        "2) Provides support for internalization of messages, application lifecycle events, and validations \n" +
                        "3)Requires you to use the org.springframework.context package within your web application\n" +
                        "4) Provides various enterprise level services, such as JNDI access, EJB integration, email, remoting, and scheduling.");
                break;

            case 4:
                System.out.println("MVC\n" +
                        "1) Provide a flexible Model - VIew Controller implementation for creating Web applications.\n" +
                        "2) Enables you to separate the model and application logic from the view or the application UI\n" +
                        "3) Requires you to use the org.springframework.web package within your web application \n" +
                        "4) Enables you to integrate several other MVC frameworks, such as Struts and WebWorks");
                break;

            case 5:
                System.out.println("AOP\n" +
                        "1) Enables Spring to provide support for implementing aspects within your web application.\n" +
                        "2) Support loose coupling of the application objects\n" +
                        "3) Requires you to use the org.springframework.aop package within your web application\n" +
                        "4) Enables you to separate the application logic from the system-level services called cross-cutting concerns ");
                break;

            case 6:
                System.out.println("ORM\n" +
                        "1) Enable developers to integrate the Spring framework with several oter ORM tools.\n" +
                        "2) Is built upon the DAO module to provide an easy way to build DAOs for the ORM tool.\n" +
                        "3) Require you to use the org.springframework.orm package within your web application\n" +
                        "4) Is supported by the declarative transaction management service of the  framework");

            case 7:
                System.out.println("DAO\n" +
                        "1) Aims to standardize data access work through technologies, such as hibernate, JDO, or JDBC.\n" +
                        "2) Enables you to write simple database code without worrying about database related tasks.\n" +
                        "3) Requires you to use the org.springframe.dao package within your web application\n" +
                        "4) Provides an exception hierachy for managing database connections and handling exceptions");
                break;
        }
    }
}