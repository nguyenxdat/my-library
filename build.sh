#!/bin/bash

# Build script for My Android Library

echo "🚀 Building My Android Library..."

# Clean previous builds
echo "🧹 Cleaning previous builds..."
./gradlew clean

# Run tests
echo "🧪 Running tests..."
./gradlew library:test

# Build library
echo "🔨 Building library..."
./gradlew library:build

# Generate documentation
echo "📚 Generating documentation..."
./gradlew library:dokkaHtml

echo "✅ Build completed successfully!"
echo ""
echo "📦 Ready to publish to JitPack!"
echo "1. Commit your changes to Git"
echo "2. Create a new tag (e.g., git tag v1.0.0)"
echo "3. Push tag to GitHub (git push origin v1.0.0)"
echo "4. Visit https://jitpack.io/#your-username/mylibrary"
