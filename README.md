# SmartPhoneApplication

- 環境構築
  - MAC
    - 事前作業としてbrew及びbrew caskがinstallされていること
    - javaは1.8を設定

    - android-studioのinstall
    ```
    brew cask install android-studio
    ```
    - sbtのinstall
    ```
    brew install sbt
    ```
    - PATHを通す
    ```
    vim ~/.bash_profile
    export ANDROID_HOME="/Users/username/Library/Android/sdk"
    export ANDROID_HOME=$PATH:$ANDROID_HOME/tools:$ANDROID_HOME/platform-tools
    ```
    - build
    ```
    sbt android:package
    sbt gen-idea
    ```
    - プロジェクト取り込み
    - android-studioにscala-pluginをinstall

    - エミュレーターが起動しない場合は下記リンクを参照
    ```
    http://qiita.com/mapyo/items/047df6ff0ffc332dd558
    ```
  - Windows
    - ANDROID_HOME(android-sdkのパス)が環境変数に追加されていること。
      - インストール時にSDKのインストール場所を個人で設定していない場合、隠しフォルダにインストールされるため注意。
    - javaは現時点で最新のものを入れることとする。

- 必要なPlugin
    - scala

### 対応OS
    - Android4.X系

### 運用ルール
    - pull requestは"マージ依頼"のラベルが付いているものをオーナーがmerge
        - マージ依頼のラベルが付いていない場合はレビューのみ
