package com.ddcx.designpattern.builder;

/**
 * Created by liaosi on 2017/9/21.
 */
public class BuilderTest2 {

    public static void main(String[] args) {
        Student student = new Student.Builder()
                .id(56)
                .name("小明")
                .age(12)
                .grade(6)
                .score(88.5)
                .build();
        System.out.println(student);

    }

}

class Student {

    private long id;
    private String name;
    private int age;
    private int grade;
    private double score;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", score=" + score +
                '}';
    }

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.grade = builder.grade;
        this.score = builder.score;
    }

    static class Builder {

        private long id;
        private String name;
        private int age;
        private int grade;
        private double score;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public Builder score(double score) {
            this.score = score;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

}

