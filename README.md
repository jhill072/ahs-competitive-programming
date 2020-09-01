# Overview
This repository contains code snippets and useful pieces of information for use
during your Competitive Programming class.
This repo is free for you to clone, fork, branch, and otherwise make changes to
except to push or merge to the master branch. If you are unfamiliar with `git`
procedures, then it is probably best to use the **Cloning** instructions to better
use this repository.

If you want to learn more about `git`, git flow, repositories, etc. then check
out [GitHub's documentation](https://docs.github.com/en) on the subject, and don't hesitate to reach out
to Mr. Hill for guidance or more information as well.

## Cloning this repository
_NOTE:_ you do not have to use `git` to use this repository. You can always go
directly to the file you are interested in and copy/paste its contents (hint:
the raw contents button makes this very easy!) If you use the raw download,
make sure to save as "All Files" and ensure the extension remains `.java`
after the download completes.

There are several different ways you can use this repository through the `git`
tool: you can make a branch off of this repository and make commits to that
branch, you can fork the repository and manage your own branches, or you can
always just clone and pull as changes are updated.

### Cloning (Basic)
**WARNING**: If you are planning to make changes to the files in this
repository, then you _must_ follow one of the more advanced procedures.

On your computer, make sure the `git` tool is installed. Then, in a terminal,
command prompt, or Powershell window, `cd` into the directory you want to clone
this repository to. Then run the following command:
`git clone https://github.com/jhill072/ahs-competitive-programming.git`
This will copy all of the files from the repository to your machine. Whenever
there are updates to this repo after your clone, run `git pull` while in the
cloned directory to grab the latest changes.

### Branching (Intermediate)
First, follow the instructions above for cloning the repository. Then, before
you make any changes to files, create a new `branch` by running the following:
` git checkout -b <branch-name>`
You can use whatever name you like for `<branch-name>`, but it must be unique
from anyone else's branch name. What this does is make a "snapshot" of the
repository for you to make whatever changes you want without changing the files
everyone else sees. Two situations will arise while using this method:
1. You want to share the code at school with your computer at home (or vice
versa). You can do this by running `git add *` in the root directory of where
you cloned this repo to, which lets git you'd like to save all of your changed
files (* means every file, but you can add individual files if you prefer).
Then, run `git commit` to tell git to save this snapshot of files, so you can
go back to this point if you need to later. Finally, run
`git push -u origin <branch-name>` which will upload all of your commits to
github. You can now run `git pull` on your other computer to get those changes!
2. There is new code that has been pushed to the `master` branch. In order to
get the changes that were pushed to the `master` branch, follow the steps above
to the point where you have committed your changes (you may push if you want).
Then, run `git checkout master` to switch to your local `master` branch,
followed by `git pull` to get the latest version of the `master` branch.
Next, run `git checkout <branch-name>` to switch back to your branch. You may
notice nothing is different than when you started, and that's because your
branch doesn't know about the new master updates! To get them _merged_, run the
following: `git merge master`. This will merge your local commits with those
from the latest master push. If they both changed the same file(s), you may need
to resolve conflicts in those files. Check if files need to be resolved by
running `git status`. Any files in red or with `(CONFLICT)` next to them need to
be addressed. Once you resolve these, proceed to `git add *` and perform a
`git commit` to tell git to complete the merge process.

### Forking (Advanced)
When you fork this repository, you can do almost anything you feel like. You own
the repository, which means you must maintain it as well. This involves getting
latest master as in **Branching** above, but there are also different remotes,
origins, and cloning methods. Please see [GitHub's documentation](https://docs.github.com/en/enterprise/2.13/user/articles/fork-a-repo)
for more information on this topic, as it is too broad/flexible to cover in a
simple README file.

## How to use this repository
This repository contains many starter files. Start by logging in to [our competition website](http://ahs-competitive-programming.com)
and choosing the contest for your assignment. For the starter assignments, you
should navigate this repository to find the problem(s) related to that
assignment. It should provide you with one or more methods to populate while
abstracting away the rest of the problem.

This let's you focus on the part of the problem we are learning about and not
worry about reading input, formatting the output, etc. Once you have implemented
the necessary method(s), submit that file for solution to your problem. Once you
receive a `CORRECT` response, then congratulations! You've solved the problem!

**NOTE:** Please don't completely disregard the input parsing, output
formatting, or other parts of the code that are already written for you. They
are useful information you will need to know when participating in our
practice competitions and real competitions.
