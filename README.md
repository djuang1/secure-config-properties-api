# MuleSoft Secure Configuration Properties API and Tool

### Overview

This project wraps the [MuleSoft Secure Properties Tool](https://docs.mulesoft.com/mule-runtime/4.2/secure-configuration-properties#secure_props_tool) with an API and exposes a web based tool to allow you create secure properties for your Mule project.

You can find the tool here:

https://secure-properties-api.us-e1.cloudhub.io/

and the API here:

https://secure-properties-api.us-e1.cloudhub.io/console

### Steps
You can encrypt configuration properties in your Mule applications. To create secure configuration properties, follow the steps below:

1. Create a secure configuration properties file in your Mule application. (e.g. src/main/resources/config.yaml)
1. Deploy this project or open this URL - https://secure-properties-api.us-e1.cloudhub.io/ and encrypt your properties. 
1. Define secure properties in the file by enclosing the encrypted values from the previous step between the sequence ![value]. You can see an example below.
    ```
    encrypted:
        value1: "![nXCoBCew=]"
    ```
1. Configure the file in the project with the `Mule Secure Configuration Properties Extension` module. The file must point to or include the decryption key.
1. Reference the secure properties in your XML by prefixing the properties with `secure::`
    ```
    <global-property name="prop" value="my-${secure::encrypted.value1}"/>
    ```

