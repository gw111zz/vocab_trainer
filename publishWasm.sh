#!/bin/bash -x

./gradlew :webApp:wasmJsBrowserDistribution
rm -fr docs 
mkdir docs
cp -rv webApp/build/dist/wasmJs/productionExecutable/* docs
git add docs
git commit -m "New wasm build"
git push




