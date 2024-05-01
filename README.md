# benchmark

# Language setup
Setup mise for language version control. [mise](https://mise.jdx.dev/getting-started.html#quickstart)
`curl https://mise.run | sh`
`echo 'eval "$(~/.local/bin/mise activate zsh)"' >> ~/.zshrc`

When we navigate to the root of the folder, the configured language version is automatically referenced.

For the first time, mise will say that the languages are missing, then please run `mise i` for setting up the required languages.

## Current Language versions
| Language | Version |
| -------- | ------- |
| Java | 21 |
| Python | 3.12 |
| Go | 1.22 |

## Run all benmarks
Execute the `run.sh` file in the root inorder to run all the benchmarks.
`sh run.sh`
