package com.paul.streams;

public class Persona {
        private String name;
        private int age;

        Persona(String n, int a){
            name = n;
            age = a;
        }

        Persona(){
            name = "empty";
            age = 0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
}
