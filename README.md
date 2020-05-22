# TestVariantAttributes

A test repo to try to understand Variant Attributes matching.

You will need an Android SDK installed:

```
echo 'sdk.dir=/Path/To/Your/Android/sdk' > local.properties

> ./gradlew assembleDebug
> Task :generateDebugRFile FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':generateDebugRFile'.
> Could not resolve all files for configuration ':debugCompileClasspath'.
   > Could not resolve com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0.
     Required by:
         project :
      > The consumer was configured to find an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar'. However we cannot choose between the following variants of com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
          - android-debugApiElements
          - android-debugRuntimeElements
          - jvm-api
          - jvm-runtime
        All of them match the consumer attributes:
          - Variant 'android-debugApiElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Unmatched attributes:
                  - Provides attribute 'com.android.build.api.attributes.VariantAttr' with value 'debug' but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but the consumer didn't ask for it
          - Variant 'android-debugRuntimeElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Unmatched attributes:
                  - Provides attribute 'com.android.build.api.attributes.VariantAttr' with value 'debug' but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but the consumer didn't ask for it
          - Variant 'jvm-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares an API of a component:
              - Unmatched attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
                  - Provides its elements packaged as a jar but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' but the consumer didn't ask for it
          - Variant 'jvm-runtime' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares a runtime of a component:
              - Unmatched attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
                  - Provides its elements packaged as a jar but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' but the consumer didn't ask for it
        The following variants were also considered but didn't match the requested attributes:
          - Variant 'android-releaseApiElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares an API of a component, as well as attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug'
          - Variant 'android-releaseRuntimeElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares a runtime of a component, as well as attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug'
          - Variant 'ios-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component and the consumer needed an API of a component
              - Other compatible attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
          - Variant 'iosSim-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component and the consumer needed an API of a component
              - Other compatible attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
          - Variant 'metadata-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component and the consumer needed an API of a component
              - Other compatible attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
   > Could not resolve com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0.
     Required by:
         project :
      > The consumer was configured to find an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar'. However we cannot choose between the following variants of com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
          - android-debugApiElements
          - android-debugRuntimeElements
          - jvm-api
          - jvm-runtime
        All of them match the consumer attributes:
          - Variant 'android-debugApiElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares an API of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Unmatched attributes:
                  - Provides attribute 'com.android.build.api.attributes.VariantAttr' with value 'debug' but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but the consumer didn't ask for it
          - Variant 'android-debugRuntimeElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares a runtime of a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug', attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Unmatched attributes:
                  - Provides attribute 'com.android.build.api.attributes.VariantAttr' with value 'debug' but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'androidJvm' but the consumer didn't ask for it
          - Variant 'jvm-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares an API of a component:
              - Unmatched attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
                  - Provides its elements packaged as a jar but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' but the consumer didn't ask for it
          - Variant 'jvm-runtime' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares a runtime of a component:
              - Unmatched attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
                  - Provides its elements packaged as a jar but the consumer didn't ask for it
                  - Provides release status but the consumer didn't ask for it
                  - Provides attribute 'org.jetbrains.kotlin.platform.type' with value 'jvm' but the consumer didn't ask for it
        The following variants were also considered but didn't match the requested attributes:
          - Variant 'android-releaseApiElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares an API of a component, as well as attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug'
          - Variant 'android-releaseRuntimeElements' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0 declares a runtime of a component, as well as attribute 'com.android.build.gradle.internal.dependency.AndroidTypeAttr' with value 'Aar':
              - Incompatible because this component declares a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'release' and the consumer needed a component, as well as attribute 'com.android.build.api.attributes.BuildTypeAttr' with value 'debug'
          - Variant 'ios-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component and the consumer needed an API of a component
              - Other compatible attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
          - Variant 'iosSim-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component and the consumer needed an API of a component
              - Other compatible attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')
          - Variant 'metadata-api' capability com.apollographql.apollo:apollo-normalized-cache-sqlite:2.1.0:
              - Incompatible because this component declares a usage of 'kotlin-api' of a component and the consumer needed an API of a component
              - Other compatible attributes:
                  - Doesn't say anything about com.android.build.api.attributes.BuildTypeAttr (required 'debug')
                  - Doesn't say anything about com.android.build.gradle.internal.dependency.AndroidTypeAttr (required 'Aar')

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

Deprecated Gradle features were used in this build, making it incompatible with Gradle 7.0.
Use '--warning-mode all' to show the individual deprecation warnings.
See https://docs.gradle.org/6.4.1/userguide/command_line_interface.html#sec:command_line_warnings

BUILD FAILED in 1s
10 actionable tasks: 1 executed, 9 up-to-date
```
