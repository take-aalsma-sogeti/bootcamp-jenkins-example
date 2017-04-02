click [here](../README.md) to go back to the main README. 

It would be silly to let you do a Jenkins Bootcamp without the software we are going to use mainly... Below are instructions to download Jenkins, additional software and to set up your GitHub Account.

In this Chapter we will discuss the following topics:

- Installation of Jenkins
- additional Software needed for the bootcamp
- set up a GitHub account.

Note that we only discuss the windows versions of the software here

## Jenkins
Jenkins Can be downloaded from [Jenkins.io](http://www.Jenkins.io)

We will be using the LTS version (2.46.1)

![](/docs/images/Install/install-0.png "Download LTS")

![](/docs/images/Install/install-00.png "Choose Version")


### install instructions

#### Java

- Run Java Runtime Environment
- use command "java -jar jenkins.war"

#### Docker

- Run Docker Command "run docker pull jenkins"
- Expose a container, exposing it on port
- - "docker run -d -p 49001:8080 -v $PWD/jenkins:/var/jenkins_home:z -t jenkins"
- - for more info click [here](https://wiki.jenkins-ci.org/display/JENKINS/Installing+Jenkins+with+Docker)

#### Mac

Mac Users can use the outdated Mac OS App

- follow instruction from [stisti on GitHub](https://github.com/stisti/jenkins-app)

#### Windows

- Follow the install wizard

The following images represent the install wizard. no real surpises to anyone using a computer.

![](/docs/images/Install/install-1.png "Opem the .exe in RAR")

![](/docs/images/Install/install-2.png "Start wizard")

![](/docs/images/Install/install-3.png "Choose destination folder")

![](/docs/images/Install/install-4.png "Install")

![](/docs/images/Install/install-5.png "Finished")


## first run

After Jenkins has been installed in will open default on "http://localhost:8080"

### change port

If you don't want jenkins to run on 8080 or if another service you use runs on that port you can change it:

- find Jenkins.xml (in the install directory you choose in the wizard)
- search for "--httpPort=8080".
- replace 8080 with the desired port number
- restart jenkins (http://localhost:8080/safeRestart)
- alternatively you can start java on another port using "java -jar jenkins.war -httpPort=8081" (or any other port)

### next up?

You can continue [Configuring Jenkins](/docs/Config.md) and continue installing the additional software later. or continue installing the software doing the configuration later.


## additional software
Additionally for this bootcamp you will need Git and Java SDK. If you do not have these find the downloads below. 
Instructions with screens are added in the [Detailed instrcutions](/docs/Install.md)

- Git can be downloaded [here](https://git-scm.com/download/win)
- Java SDK can be downloaded [here](http://www.oracle.com/technetwork/java/javase/downloads/index.html)

### Git

![](/docs/images/Install/git-1.png "Logo Title Text 1")
![](/docs/images/Install/git-2.png "Logo Title Text 1")
![](/docs/images/Install/git-3.png "Logo Title Text 1")   
![](/docs/images/Install/git-4.png "Logo Title Text 1")
![](/docs/images/Install/git-5.png "Logo Title Text 1")
![](/docs/images/Install/git-6.png "Logo Title Text 1")
![](/docs/images/Install/git-7.png "Logo Title Text 1")
![](/docs/images/Install/git-8.png "Logo Title Text 1")
![](/docs/images/Install/git-9.png "Logo Title Text 1")
![](/docs/images/Install/git-10.png "Logo Title Text 1")
![](/docs/images/Install/git-11.png "Logo Title Text 1")
![](/docs/images/Install/git-12.png "Logo Title Text 1")

### Java SDK

![](/docs/images/Install/Java-1.png "Logo Title Text 1")
![](/docs/images/Install/Java-2.png "Logo Title Text 1")
![](/docs/images/Install/Java-3.png "Logo Title Text 1")
![](/docs/images/Install/Java-4.png "Logo Title Text 1")
![](/docs/images/Install/Java-5.png "Logo Title Text 1")

## github account
Since this bootcamp uses git it is mandatory to have a github account.
- Go to [Github](www.github.com) and create a user account.
- go to [the bootcamps repo](https://github.com/jeroenschepens/bootcamp-jenkins-example)
- Fork the repository into your own account.