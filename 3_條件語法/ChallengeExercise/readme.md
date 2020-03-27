# 條件語法

###### tags: `Kotlin`

## 　 if/ else 语句

條件式的判斷，與Java或其他語言一樣，都是使用if做為條件式
```
if ( string == "A" ){
    println("string is A")
}else if ( string == "B" ){
    println("string is B")
}else{
    println("string is else")
}
```
## 比較運算子
在if 的條件判斷式裡，有這些運算子來做比較。


| 運算子 | 說明 | 
| -------- | -------- | 
|<|小於|
|<=|小於等於|
|>|大於|
|>=|大於等於|
|==|等於|
|!=|不等於|
|===|強等於，左右側是否等於同一個引用|
|!==|不同參考|
|邏輯運算子|
|&&|且|
||||或|
|!|非|
|in|在某個range間|
## 運算子權重
運算子是有優先順序的：
`!`　→　`< ≤ > ≥`　→　`&&`　→　`||`
即便運算子有優先順序，我們還是傾向一律用大括號括起來較易閱讀。

```
if ( (a == true && b == true) || c == false ){

}
```

## 宣告一個變數裝下if後的值
```
var result = if ( isCorrect) "Good" else "Bad"
```
## range
在if裡條件式裡判斷一個值是不是在一個範圍內
```
IF( 1>=1 && 1<=10){

}
//可寫成
if ( 1 in 1..10){
        
}

```

## When
```
if (type == "A") {
    println("typeA")
} else if (type == "B") {
    println("typeB")
} else if (type == "C") {
    println("typeC")
}
//可寫成
when (type) {
    "A" -> println("typeA")
    "B" -> println("typeB")
    "C" -> println("typeC")
}
//或是搭配in使用
when (age) {
    in 1..12 -> println("小孩")
    in 13..64 -> println("大人")
    else -> println("長者")
}
```


