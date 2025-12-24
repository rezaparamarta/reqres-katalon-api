## CI/CD Execution Note

This repository includes a GitHub Actions workflow to demonstrate
CI integration using Katalon Runtime Engine (katalonc).

The pipeline successfully:
- downloads Katalon Runtime
- activates license via API Key
- locates and opens the Katalon project

However, due to current limitations and known issues of Katalon Console
when executing API-only projects in headless CI environments (Windows runner),
execution stops with exit code 2 caused by internal NullPointerException.

All test suites and test suite collections run successfully
in local Katalon Studio.
