# Vivo Compose UI Distortion Issue

This repository contains a sample project created to demonstrate a UI distortion issue that occurs specifically on Vivo devices running Funtouch OS 10 or 11, such as the Vivo Y50 and Vivo Y12. The issue arises when the app ID is set to `com.ixigo.train.ixitrain`.

## Issue Description

When the app ID is set to `com.ixigo.train.ixitrain`, the Compose UI distorts on Vivo devices with Funtouch OS 10. However, the issue does not occur when other app IDs like `com.ixigo` or `com.confirmtkt.lite` are used.

## Steps to Reproduce

1. Clone this repository.

2. Open the project in Android Studio.

3. Change build variant to debugIssue

4. Run the app on a Vivo device with Funtouch OS 10, such as a Vivo Y50 or Vivo Y12.

5. Observe the UI distortion in the Compose activity which uses a simple `LazyColumn`.

## Expected Behavior

The UI should render correctly without any distortions.

## Actual Behavior

The UI distorts when the app ID is set to `com.ixigo.train.ixitrain`. This does not happen when the app IDs are set to `com.ixigo` or `com.confirmtkt.lite`.

## Repository Contents

- `app/`: Contains the sample Compose app demonstrating the issue.
- `screenshots/`: Contains screenshots demonstrating the UI distortion on Vivo devices.
- `recordings/`: Contains screen recordings demonstrating the UI distortion on Vivo devices.

## Environment

- Devices: Vivo Y50, Vivo Y12
- OS: Funtouch OS 10
- Issue App ID: `com.ixigo.train.ixitrain`
- Working App IDs: `com.ixigo`, `com.confirmtkt.lite`

## Screenshots & Recordings

Screenshots and recordings demonstrating the issue can be found in the `screenshots` and `recordings` folders respectively.

## Contact

For any further details or clarifications, please contact us at [sankalp.singh@ixigo.com], [bharat@ixigo.com], [vishal.arora@ixigo.com].
