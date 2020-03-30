# 函數
###### tags: `Kotlin`
## 使用intelliJ內建功能重建函數

原程式碼
```
var heathStatus = when (heathPoints) {
    100 -> "is in excellent condition!"
    in 90..99 -> "has a few scratches."
    in 75..89 -> if (isBlessed) {
        "has some minor wounds but is healing quite quickly!"
    } else {
        "has some minor wounds."
    }
    in 15..74 -> "looks pretty hurt."
    else -> "is in awful conditon"
}
```


1. 選取目標程式碼後右鍵

    ![](https://i.imgur.com/megwI4T.png)


3. 選Refactor → Extract → Function...

    ![](https://i.imgur.com/hyzvkgG.png)

1. 在設定框輸入你需要的函數名稱

    ![](https://i.imgur.com/9TfIWx5.png)

1. 就會在下方出現一個functuon
    
    ![](https://i.imgur.com/3IwuJpk.png)
     
1. 原程式碼部分會取代formatHeathStatus(heathPoints, isBlessed)
    
    ![](https://i.imgur.com/4N4fh45.png)

## 函數結構介紹

![](https://i.imgur.com/bK2OLax.png)

## 函數多型

1. 先建立一個自訂函數，在main裡新增一個函數。

    ![](https://i.imgur.com/DH9ko9R.png)
1. 右鍵選Refactor → Extract → Function...後，會新增這個自訂函數，在函數裡先印一段文字來看看。
    
    ![](https://i.imgur.com/2xks91Z.png)
    
    結果：
    
    ![](https://i.imgur.com/LdCAV5E.png)
    
3. 在新建一個函數名稱相同的castFireball函數，這次後面帶入數字。

    
    ![](https://i.imgur.com/xfdZIto.png)

    
1. 依樣在下方新增自訂函數，這次輸入的方式不一樣，需要傳入參數，印出部分需把數字印出來。
    


    ![](https://i.imgur.com/98ajBfF.png)
    
    連上次新增函數呈現樣子：
    
    ![](https://i.imgur.com/LVOc9Ql.png)
    
    輸出結果：
    
    ![](https://i.imgur.com/QOknXAf.png)
    
    由此可見函数有参数的话，就會使用帶參數的函數來執行。

1. 將兩個還數合併

    我們使用這個帶參數傳入的來修改

    ![](https://i.imgur.com/9Y9fEpN.png)
    
    在numFireball:Int後加入如果沒有輸入的後預設值為２
    
    ![](https://i.imgur.com/jXJr72n.png)

1. 單表達式寫法


    原寫法
    
    ![](https://i.imgur.com/hTJTido.png)
    
    單表達寫法
    
    ![](https://i.imgur.com/Nz5Iwjf.png)


    
    





