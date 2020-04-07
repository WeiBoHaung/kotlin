# 匿名函數與函數類型

###### tags: `Kotlin`

## 匿名函數基本語法
格式：

```
{
    函數內容
}()
```
範例：
```
println(

{ 
    val currentYear = 2018
    "Welcome to SimVillage, Mayor! (copyright $currentYear)"
}()

)
```
輸出：

![](https://i.imgur.com/MIKKCPZ.png)

## 宣告變數時呼叫匿名函數
格式：

`val 變數名稱 : 輸入輸出資料類型 = { 輸入資料 -> 函數內容 }`

範例：
```
val sum2:(Int,Int)-> Int  = { a , b -> a + b}
```
變數類型自動推斷寫法：

```
val 變數名稱 = { 輸入變數：變數類型 -> 函數內容} 
val sum1 = { a: Int, b: Int -> a + b }
```
總參考：

![](https://i.imgur.com/IJJalVn.png)

sum3是原本是用自訂函數的寫法，最後三個sum結果相同，但是程式碼簡化了許多。






