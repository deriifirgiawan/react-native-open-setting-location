import * as React from 'react';

import { StyleSheet, View, Button} from 'react-native';
import { openLocationService } from 'react-native-open-setting-location';

export default function App() {

  return (
    <View style={styles.container}>
      <Button title="Open Location Setting" onPress={() => openLocationService()} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
