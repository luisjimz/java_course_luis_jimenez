public class PersonGreeter {

    //DependencyInjection
    private Person person;

    public PersonGreeter(Person person){
        this.person = person;
    }

    public String sayHello(){
        return "Hello " + person.getFirstName() + " " + person.getLastName();
    }
}
