package OpenSourceProjects_Storybook.patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with uuid = '759f0116-2f7d-4c03-8220-56e4ab03be3a' (id = 'OpenSourceProjects_Storybook_Danger')
accordingly and delete the patch script.
*/
changeBuildType("759f0116-2f7d-4c03-8220-56e4ab03be3a") {
    params {
        expect {
            param("env.DANGER_GITHUB_API_TOKEN", "49aa9a6549007391dfcef9c76fca32a73560fd83")
        }
        update {
            password("env.DANGER_GITHUB_API_TOKEN", "credentialsJSON:8fa112e0-d0e0-4f9f-9f18-01471a999b4d", display = ParameterDisplay.HIDDEN)
        }
    }
}
