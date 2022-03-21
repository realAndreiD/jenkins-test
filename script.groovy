def buildApp() {
    echo "Build stage for version ${NEW_VERSION}"
}

def testApp() {
    echo "Test stage 2 executed"
}

def deployApp() {
    echo "Deploy stage for version ${params.VERSION}"
}

return this
