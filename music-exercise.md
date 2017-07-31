# Music Exercise

See the [README.md](README.md) file for setup instructions.

This document will serve as an outline of the requirements for the Music Exercise to create a working REST API. Please use the project in this git repository as a starting point for a simple REST API that will serve up a Music Library. Please create a branch off of this reposiotry repository and push your changes here on the new branch.

# Requirements

- Create database objects (tables) that will store Music Albums and the track lists (songs)
    - Album must have a title and author and allow for multiple tracks
    - Track must have a title and belong to an album
- Create a new REST endpoint that will list all the tracks for a given album
    - Response must be well formatted JSON
- Create a new REST endpoint to insert a new track

# Bonus

For extra-credit it would be great to have a nice interface for viewing the REST api. [Swagger](https://swagger.io/) is a great option for building contract first APIs. Use this (or another contract-first framework) to publish a specification of what your API endpoints are and what the input and output of each one is.
