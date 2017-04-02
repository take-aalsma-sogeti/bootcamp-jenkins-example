click [here](../README.md) to go back to the main README. 

# Table of Contents
- [Unlock jenkins](#unlock-jenkins)
- [Additional Plugins](#additional-plugins)
- [Jenkins Config](#jenkins-config)
  - [Git](#git)
  - [Java](#java)
  - [Maven](#maven)
- [Optional Configuration](#optional-configuration)
  - [Changing Ports](#change-port)

***

## Unlock Jenkins

[../Back to ToC](#table-of-contents)

After Jenkins has been installed in will open default on "http://localhost:8080"

Upon first run Jenkins will be locked and you will need to unlock it.

![](/docs/images/Config/config-1.png "Unlock")

The gui will present you with a path and file you need to open.

In this file you will find a token string which needs to be copied into the Jenkins GUI.


## Install Plugins

[../Back to ToC](#table-of-contents)


![](/docs/images/Config/config-2.png "Suggested Plugins")

Go with the suggested plugins 

![](/docs/images/Config/config-3.png "Suggested Plugins")

Have a coffee

![](/docs/images/Config/config-4.png "Suggested Plugins")

create a user.

![](/docs/images/Config/config-5.png "Suggested Plugins")

After creating a user jenkins is ready. Select Start Using Jenkins and you will be presented with the Jenkins Dashboard

![](/docs/images/Config/config-6.png "Jenkins Dashboard")


***

## additional plugins

[../Back to ToC](#table-of-contents)

In order to complete the bootcamp additional plugins are needed. 

We need to Install the "Job DSL" plugin.

![](/docs/images/Config/config-6.png "Jenkins Dashboard")

From the jenkins Dashboard select "Manage Jenkins"

![](/docs/images/Config/config-7.png "Manage Jenkins")

Select "Manage Plugins"

![](/docs/images/Config/config-8.png "Manage Plugins")

Click the "Available" tab and search for "Job DSL"

Select the plugin and click "Download now and install after restart"

Alternatively you can "install without restart" and perform a manual restart with http://localhost:8080/safeRestart


***

## Jenkins config

[../Back to ToC](#table-of-contents)

If you haven't done so already install the additional software in order to continue - [Additional Software](/docs/install.md#Additional-Software)

![](/docs/images/Config/config-9.png "Manage Plugins")

From the Jenkins Dashboard choose "Manage Jenkins"

![](/docs/images/Config/config-10.png "Manage Jenkins")

Choose "Global Tool Configuration"

In global Tool configuration configure the following options

### Git

[../Back to ToC](#table-of-contents)

![](/docs/images/Config/config-11.png "Manage Jenkins")

Name: Git
Path: __PathWhereYouInstalledGit__\git.exe (or find the path if you are using a nin-windows OS)

### Java

[../Back to ToC](#table-of-contents)

![](/docs/images/Config/Java-1.png "Manage Jenkins")

Choose "Add JDK"

![](/docs/images/Config/Java-2.png "Manage Jenkins")

Uncheck install automatically

Name: Java SDK
JAVA_HOME: __PathWhereYouInstalledJavaSDK__ (don't include any libraries. Just the path is fine.)

### Maven

[../Back to ToC](#table-of-contents)

![](/docs/images/Config/config-12.png "Manage Jenkins")

Name: M3
Check Install Automatically
Version 3.3.9

***

## Optional Configuration

[../Back to ToC](#table-of-contents)

### Change Port

If you don't want jenkins to run on 8080 or if another service you use runs on that port you can change it:

- find Jenkins.xml (in the install directory you choose in the wizard)
- search for "--httpPort=8080".
- replace 8080 with the desired port number
- restart jenkins (http://localhost:8080/safeRestart)
- alternatively you can start java on another port using "java -jar jenkins.war -httpPort=8081" (or any other port)


[Back to top](#table-of-contents)