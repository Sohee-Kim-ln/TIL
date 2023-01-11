

# markdown 문법 필기

## heading

heading

* h1 `#` -> html에서는 <h1> 내용</h1>

- h2 `##`
  - 

h3 ###

h4 ####

h5 #####

h6 ######

## list

### unordered list(순서가 없는 리스트

)

`*` /`-` 

* ㄱ
  * ㄴ
    * ㄷ
      * ㄹ
        * ㅁ
          * ㅂ
            * ㅅ

html에서는 `<ul></ul>`

### ordered list(순서가 있는 리스트)

숫자+.

1. 순서가 있는 리스트
2. 순서
   1. ㅇㅇ
      1. ㅇ

html에서는 `<ol></ol>`

## text style

### bold

`**` 내용 `**`로 표현 가능

`ctrl+b` 

**안녕**하세요

### italic

`*`기울기`*`

`ctrl+i`

*안녕*하세요

### bold+italic

안녕하세요 ***서울 8반***입니다

`***`내용`***`

## hyperlink

### link

`[텍스트](가고싶은 url)`

[구글](https://www.google.com)

### img

`![대체 텍스트](보여주고 싶은 이미지 url)`

이미지가 정상적으로 로딩되지 않았을 때 대체 텍스트 보여줌

![루피이미지](https://item.kakaocdn.net/do/3727c16c143eb219d7b32939d9886113ce9463e040a07a9462a54df43e1d73f1)

마크다운 안에 이미지 경로를 보여주는 기능이 없다. 그래서 이미지 못불러 올 때도 있다??

![루피이미지](C:\Users\SSAFY\Desktop\TIL\assets\3727c16c143eb219d7b32939d9886113ce9463e040a07a9462a54df43e1d73f1.png)

## Code Block

### inline code block

빽킷을 활용해서 인라인 코드를 만든다



### code block

빽킷을 세번 입력하면 박스가 나온다

```java
//주석
class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}
```



# Table

| 바 : 바 하나가 세로 한줄

2행 3열 2*3 하려면

| | | |  엔터

|      |      |      |
| ---- | ---- | ---- |
|      |      |      |

