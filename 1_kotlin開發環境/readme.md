# kotlin開發環境
###### tags: `Kotlin` `IntelliJ IDEA`
使用安裝IntellJ IDEA開發首个Kotlin。借此，來熟悉開發環境，開啟Kotlin新專案，編輯及編譯Kotlin程式碼，以及查看输出结果。

## 安裝IntelliJ IDEA 
有兩種安裝方式
1. 下載[IntelliJ IDEA](https://www.jetbrains.com/idea/)
2. 下載IDE管理工具[Toolbox](https://www.jetbrains.com/toolbox-app/)
    
    安裝後啟動會在工具列出現縮圖點擊即可看JetBrains安裝列表點擊你需要的安裝（圖中我已安裝IntelliJ IDEA Ultimate
    ![](https://i.imgur.com/AkIpXAg.png)
    
## 開啟新專案

1. 點擊Create New Project
![](https://i.imgur.com/IfGpmHq.png)
2. 記得勾選Kotlin JVM
![](https://i.imgur.com/ZmM55v7.png)
3. 設定專案路徑
![](https://i.imgur.com/P5F0oFM.png)
4. 開啟後稍等一下他需要建立基本物件，等待右下角進度條。
    在專案下/src/main/kotlin新增檔案，右鍵New->kotlin file/class
    ![](https://i.imgur.com/vY5VkpR.png)
    輸入檔名後敲下enter
    ![](https://i.imgur.com/OLBW0rB.png)

5. 輸入程式碼
    小技巧：輸入ma然後按下tab，系統會自動補完main這個function所需程式碼
    ![](https://i.imgur.com/AC8SF8K.png)
    ![](https://i.imgur.com/ErUXMMq.png)
    不免俗的來個hello,word吧
    ![](https://i.imgur.com/BayKwlD.png)
6. 執行程式碼
    點擊右邊的執行
    ![](https://i.imgur.com/Ib4ldQM.png)
    下方會顯示結果
    ![](https://i.imgur.com/pmJ8iqi.png)

    
7. 使用REPL研究kotlin
    REPL是英文read（讀取）、evaluate（求值）、print（輸出）和loop（循環）的首字母縮寫。
    像是一個即時運算視窗。
    在Tools->Kotlin->Kotlin REPL
    ![](https://i.imgur.com/9pnky2o.png)
    下方會多出一個視窗
    ![](https://i.imgur.com/2Tnf5h4.png)
    在視窗中輸入5+3*2然後按下commend+enter過幾秒他就會輸出結果






