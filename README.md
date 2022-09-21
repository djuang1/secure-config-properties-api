# MuleSoft Secure Configuration Properties API and Tool

## Overview

This project wraps the [MuleSoft Secure Properties Tool](https://docs.mulesoft.com/mule-runtime/latest/secure-configuration-properties#secure_props_tool) with an API and exposes a web based tool to allow you create secure properties for your Mule project.

It supports the following features:
- Encrypt and decrypt individual string properties, all properties of a file, and file level encryption.
- Select any [algorithm and mode](https://docs.mulesoft.com/mule-runtime/latest/secure-configuration-properties#supported_crypto) supported by the tool and set their defaults values.
- Disable decryption using a configuration.
- Provide the encryption key from the environment or a configuration file. 

You can find an online version of the tool on [Cloudhub](https://secure-properties-api.us-e1.cloudhub.io/) as well as its [API](https://secure-properties-api.us-e1.cloudhub.io/console).

## Deploying the tool

- Clone the project somewhere.
- [Download the Secure Property Tool](https://docs.mulesoft.com/mule-runtime/latest/secure-configuration-properties#secure_props_tool) from Mulesoft' docuemntation.
- Copy the jar in `src/main/resources/`.
- Configure the application based on `src/main/resources/config.example.yaml` and extend the app to your need (eanble HTTP, add a TLS keystore, multiple environments ...).
- Deploy the application in your runtime.
- Encrypt and decrypt content using the application UI or API.

For more information, read the documentation about [securing configuration properties](https://docs.mulesoft.com/mule-runtime/latest/secure-configuration-properties).

## Authors

Created by [Dejim Juang](https://github.com/djuang1) with the contribution of [Gauthier POGAM--LE MONTAGNER](https://github.com/GauthierPLM).
