# payback-task
This repo contains automation of payback android app using appium and kotlin.

## Running the test

### Install Appium Server
Install Appium server using node.js
```
npm install -g appium
```
then start the server.

### Setup
Appium will use the first device that connected to ADB so please check `adb devices` and make sure that
at least one device is connected.(We have used real device so refer capability and change accordingly)

For more information https://github.com/appium/appium/blob/master/docs/en/drivers/android-uiautomator2.md

### Run the test
Start appium server then use the test task like normal gradle project. 
```
./gradlew test 
```

## Writing the test

### Finding the element ID
We have use appium inspector tool for find element such as XPath or ID.
