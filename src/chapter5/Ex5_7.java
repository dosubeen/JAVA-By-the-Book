package chapter5;

public class Ex5_7 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println("args["+i+"] = \""+args[i]+"\"");
        }
    }


















    /*String 클래스의 주요 메서드
    char charAt(int index) - 문자열에서 해당 위치(index)에 있는 문자를 반환한다.
    int length() - 문자열의 길이를 반환한다.
    String substring(int from, int to) - 문자열에서 해당범위 (from~to)의 문자열을 반환한다.(to는 포함안됨)
    boolean equals(Object obj) - 문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false
    char[]toCharArray() - 문자열을 문자배열(char[])로 변환해서 반환한다.
    */
}
