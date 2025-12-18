
public class Person {
	   String name;
	    int age;
	    String location;

	    // 생성자
	    Person(String name) {
	        this.name = name;
	        this.age = 0;
	        this.location = "미정";
	    }

	    // 나이 설정
	    void setAge(int age) {
	        this.age = age;
	    }

	    // 이동
	    void go(String location) {
	        this.location = location;
	        System.out.println(name + "은(는) " + location + "로 갔다.");
	    }

	    // 상태 출력
	    void print() {
	        System.out.println("이름: " + name);
	        System.out.println("나이: " + age);
	        System.out.println("현재 위치: " + location);
	        System.out.println();
	    }
	}