def call(String ImageName, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(
        credentialsId: "DockerhubCred",
        usernameVariable: "dockerHubUser",
        passwordVariable: "dockerHubPass"
    )])
    {
//    sh 'echo $dockerHubPass | docker login -u $dockerHubUser --password-stdin'
    sh "docker push $dockerHubUser/$ImageName:$ImageTag"
    }
}
