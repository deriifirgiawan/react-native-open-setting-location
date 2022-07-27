# react-native-open-setting-location

This package for opened setting GPS in android

## Installation

```sh
npm install react-native-open-setting-location
```

## Usage

```js
import React from "react";
import { View, Button } from "react-native";
import { openLocationService } from 'react-native-open-setting-location';

export default function App() {

  return (
    <View>
        <Button
            title="Open Location Setting"
            onPress={() => openLocationService()}
        />
    </View>
  );
}

.

```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
