# 第 2 章　變數、常數和類型

###### tags: `Kotlin`

## 宣告變數
宣告變數的方式如下

![](https://i.imgur.com/989cIfQ.png)

常用變數類型

|類型| 說明 | 應用舉例 |
| -------- | -------- | -------- |
|String|字串|"Estragon" ， "happy meal" |
|char|單字元|'X' ， Unicode character U+ 0041 |
|Boolean|true/ false 值|true ， false| 
|Int|整数|5，12，555，42434 |
|Double|小数|3. 14 ， 2. 718 |
|List|元素集合|3, 1, 2, 4, 3 ， "root beer", "club soda", "coke" |
|Set|不重複的元素集合|"Larry", "Moe", "Curly" "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"|
|Map|對應集合|"small" to 5. 99, "medium" to 7. 99, "large" to 10. 99|

常用變數大小

| 類型 | 大小(bits) | 最小 | 最大 |
| -------- | -------- | -------- |--------|
| Byte     | 8| -128     |127|
| short    | 16|-32768|32767|
|Int|32|-2,147,483,648 ($-2^{31}$)|2,147,483,647 ($2^{31}$ - 1)|
|Long|64|-9,223,372,036,854,775,808 ($-2^{63}$)|9,223,372,036,854,775,807 ($2^{63}$ - 1)|

| 類型 | 大小(bits) | 指數位數 |小數點位數|
| -------- | -------- | -------- |--------|
| Float|32|8|6-7|
|Double|64|11|15-16|


## 唯讀變數宣告

唯讀變數的選告方法如下:

將var換成val

`val playerName: String = "Estragon"`

## 自動辨識的宣告方式

可以將型態刪去kotlin判定預設值使用最適合的型態

`var playerName="Estragon"`




