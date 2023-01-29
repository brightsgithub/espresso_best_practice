# Espresso Testing

## Current approach vs Hybrid approach
Consider we have multiple screens, let's say 10 screens and each screen has a title and a submit button that goes to the next screen.

There is a requirement to test Screen 9 that states:

- Step 1: Verify we are on screen 9 and that the page is displayed correctly and responds correctly to user actions
- Step 2: Ensure clicking the submit button navigates to Screen 10
- Step 3: Ensure we can come back to Screen 9

The above can be achieved in two ways:

### Long route - Current approach (Big O notation is O(n) Linear)
- Navigate through Screen 1, 2, 3 4, 5 ,6 7, 8 just to get to screen 9
- Not good IMO
- We create dependencies between screens i.e. if screen 4 fails, all screens above it fail too etc.
- Tests take longer to write and execute.

### Short route - Hybrid approach (Big O notation is O(1) Constant)
- Launch Screen 9 independently and begin testing.
- We create zero dependencies (if screen 5 fails, it won't affect screen 9)
- Tests are much quicker to code up and execute.

#### How do we test Step 3 navigation with the Hybrid approach?
Easy, we simply allow the Screen 9 test to click on its submit button to launch Screen 10 and we confirm screen 10 is shown.
We then close Screen 10 and confirm we are back on Screen 9.

#### What about navigating back from Screen 9 to Screen 8?
The Screen 9 test will not have to worry about this. This is because Screen 8 will cover this in its own test during its navigation checks.
When testing, Screen 8 will confirm it can get to Screen 9 and it will confirm it can return back to Screen 8.

The key difference is avoiding the steps to arrive at our destination.
By doing this, we reduce tons of time, dependencies, coding time and we cover navigation.

### Recommended by Google
This is also the recommended approach as mentioned by one of the Android Developers from Google https://www.youtube.com/watch?v=9JDrrGx1_Y4&t=2105s (Listen between 35:00 - 36:50)

### POC Screen recording (with voice)
I have prepared a demo that contains two test suites that tests the above scenario.

- Test suite 1 - CurrentWay
- Test suite 2 - Hybrid approach
You can see the benchmarks in the demo.

## Getting Started
- Clone the repository
- Open the project in Android Studio
- Run the test suites
- Compare the benchmarks

### Prerequisites
- Android Studio
- Emulator or physical device
- Gradle

### Built With
- Espresso - The Android testing framework
- Gradle - Build tool

### Authors
- Bright Owusu-Amankwaa

### License
This project is licensed under the MIT License - see the LICENSE.md file for details.

### Acknowledgments
- Google for creating Espresso
- The Android Developer from Google for recommending the Hybrid approach.

### Demo (with sound)
https://user-images.githubusercontent.com/5901490/215320181-ca2df853-22a9-4203-b620-12171ea13cef.mp4

### Benchmarks
![benchmark_comparison](https://user-images.githubusercontent.com/5901490/215320442-f543410b-af04-4d68-ae7c-3a8e47bbb921.png)
