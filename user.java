public class user {
    String name,email;  //constructor and class at user.java common sense
    int age;
    user(String called){ //just to explain that variable and parameter doesn't need to be same
        this.name = called;
        this.age = 0;
        this.email = "Null";

    }
    user(String called,int Age){ //just to explain that variable and parameter doesn't need to be same
        this.name = called;
        this.age = Age;
        this.email = "Null";

    }
    user(String called,int Age,String mail){ //Allowing variable arguments to be raised 1,2,3 won't demand strictly for 3
        this.name = called;
        this.age = Age;
        this.email = mail;

    }
    user(){ //just to explain that variable and parameter doesn't need to be same
    this.name = "no_name";
    this.age = 0;
    this.email = "Null";

    }
}
