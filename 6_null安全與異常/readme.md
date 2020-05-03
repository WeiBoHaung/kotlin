# 第六章
 ###### tags: `Kotlin`
## null值
null是一個特殊值，用來表明var或val變數的值不存在。

包括Java內部的許多程式語言中，null常常會導致應用崩潰，因為讓不存在的東西做事情是不可能的。
如果一個var或val變量能接受空值，Kotlin需要你做個特別宣告。

在看可空性之前，我們先來看一下為什麼要有null。
在前面章節的練習中，為記錄玩家擁有坐騎的情況，你可能需要一個可以是空值沒有坐騎，但0和null不一樣，就不應該是null值了。

我們來試試看開啟一個檔案，創建一個名為Tavern.kt的文件。

輸入：
```
fun main() {
    var a="aaaa"
    a=null
}
```

![](https://i.imgur.com/IgGXoaD.png)

還沒運行，null就被打上了紅色波浪號，這是Intellij的警告。

這表示，現在這個寫法只有宣告他是個字串，而沒有告訴他可以是可null的字串。

## Kotlin的可null型變數宣告

如果我們剛剛測試的，Kotlin的做法是不讓你給非可null類型變量賦值null值。

但是null在Kotlin裡依然存在。要如何宣告呢？
```
fun main() {
    var a:String?
    a=null
}
```
![](https://i.imgur.com/BtayOEL.png)

我們可以在變數宣告實在型態後方多一個？表示該變數可以是null值

## 在函數回傳null

原本寫法是不能回傳null的：

![](https://i.imgur.com/RYXcVe8.png)

一樣我們需要再回傳宣告時搞與型態宣告後加上？

![](https://i.imgur.com/rn8r00L.png)
