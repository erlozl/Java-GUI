package gui_project.ex00;

import com.google.gson.Gson;

class User {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class Lib01 {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("ssar");
        user.setPassword("1234!");
        // 다른 사람 컴퓨터로 옮길 때는 문자열로 해야 함

        // String testData = "{\"username\" : \"ssar\"}";
        // System.out.println(testData);

        Gson gson = new Gson();
        // 만약 import가 안 뜬다면
        // 코끼리에 가서 새로고침 누르고 기다렸다가 다시 실행해보기
        String requestBody = gson.toJson(user);
        System.out.println(requestBody);
        // 통신할 때는 json으로 문자를 바꿔서 보내진다?

    }
}
