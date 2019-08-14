pipeline {
    agent any

    stages{
        stage('Compile Stage'){
            steps{
            withMaven(maven : 'maven_3_6_1'){
             bat 'mvn clean compile'
            }
            }
        }
        stage('Testing Stage'){
                    steps{
                    withMaven(maven : 'maven_3_6_1'){
                     bat 'mvn test -DsuiteXmlFile=C:/Users/jitendrk/git/learnautomation/testng.xml'
                    }
                    }
        }

        stage('Deploy Stage'){
                            steps{
                            withMaven(maven : 'maven_3_6_1'){
                             bat 'mvn deploy'
                            }
                            }

        }


}
}
