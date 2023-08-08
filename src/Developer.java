public class Developer {
    private int id;
    private String name;
    private int age;
    private int salary;
    public Developer() {
    }
    public Developer(int id, String name, int age, int salary) {
        this.id = id;
        this.salary = salary;

            char s[] = name.toCharArray();
            if (name.length() < 3) {
                throw new NameException("Меньше 3 символа ");
            } else
                this.name = name;

        try {

            if (age < 0) {
                throw new AgeException(" Возрость не должень быть меньше 0");
            } else if (age > 120) {
                throw new AgeException("Возраст не можеть быть больше 120");
            } else
                this.age = age;
        } catch (AgeException a) {
            System.out.println(a.getMessage());
        }
    }

    public String getName() {
        return name;
    }
        public int setName(String name) {
        if (name.length() < 3) {
            this.name = name;
        } else {
            throw new NameException("Меньше 3  символа  не писать ");
        }

        return 0;
    }

        public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

        public int getAge ()  {
            return age;
        }

            public void setAge ( int age){
                if (age > 0 && age < 120) {
                    this.age = age;
                } else {
                    throw new AgeException("120 дан чон // 0 дон кичине ");

                }

            }

            public int getSalary () {
                return salary;
            }

            public void setSalary ( int salary){
                this.salary = salary;
            }

            @Override
            public String toString () {
                return "Developer{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", salary=" + salary +
                        '}';
            }

}
