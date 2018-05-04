### HOW TO USE template?

template is java-application using gradle with setup of libs already included and preconfigured.

steps -
1. gradle init [optional if don't want to use gradle wrapper]
2. copy/replace all content of template/* to your folder
3. run your main class
```
# using gradle wrapper
./gradlew run -PmainClass=<your-fully-qualified-main-class>
# using globaly installed gradle
gradle run -PmainClass=<your-fully-qualified-main-class>
# pass command-line args to main
gradle run -PmainClass=<your-fully-qualified-main-class> -Dexec.args="arg1 arg2 1 2 3" # to pass command line args
```
