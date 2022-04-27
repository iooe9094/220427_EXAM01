package EXAM;

public class EX2_Client extends EX7_Person {
    // 문제 2번
    private String text;

    // 문제 8번. 오버라이딩
    @Override
    public void printMember() {
        System.out.println("안녕하세요 회원정보 클래스입니다.");
    }

    // 문제 5번. 기본생성자 및 매개변수 4개 생성자
    public EX2_Client() {

    }

    public EX2_Client(int id, String name, String description, String text) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.text = text;
    }

    // 문제 6번. setter & getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
