def newGit(repo)
{
   git "${repo}"
}
def newMaven()
{
   sh 'mvn package'
}
def newDeploy(ip,pathname)
{
   deploy adapters: [tomcat9(credentialsId: '56669dda-ddff-4884-ae06-526da02164e4', path: '', url: '${ip}')], contextPath: '${pathname}', war: '**/*.war'
}

         
