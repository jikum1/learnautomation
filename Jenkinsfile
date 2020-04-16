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
                     //bat 'mvn test -DsuiteXmlFile=C:/Users/jitendrk/git/learnautomation/testng.xml'
                     bat 'mvn test'
                    }
                    }
        }

        stage('Deploy Stage'){
                            steps{
                            script {
                                     timeout(time: 10, unit: 'MINUTES') {
                                     input(id: "Deploy to Nexus", message: "Deploy Snapshot to Nexus", ok: 'Deploy')
                                     }
                            }
                            withMaven(maven : 'maven_3_6_1'){
                              bat 'mvn deploy'
                            }
                            }

        }


}
}
