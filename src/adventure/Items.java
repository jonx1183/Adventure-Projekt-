package adventure;

public class Items {

    private String name;
    private String description;

    public Items(String name, String description) {
        setName(name);
        setDescription(description);

    }

      public void setName(String name) {
        this.name = name;
    }

    public String getname(){

        return name;

    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }


    @Override
    public String toString() {
        return "Items{" +
            "name='" + name + '\'' +
            ", description='" + description + '\'' +
            '}';
    }
}








