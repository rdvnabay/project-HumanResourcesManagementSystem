import React from "react";
import { Form,Button,Checkbox,Image,Grid } from "semantic-ui-react";

export default function Register() {
  return (
    <Grid celled='internally'>
    <Grid.Row>
      <Grid.Column width={4}>
      </Grid.Column>
      <Grid.Column width={8}>
      <Form>
      <Form.Field>
        <label>First Name</label>
        <input placeholder="First Name" />
      </Form.Field>
      <Form.Field>
        <label>Last Name</label>
        <input placeholder="Last Name" />
      </Form.Field>
      <Form.Field>
        <Checkbox label="I agree to the Terms and Conditions" />
      </Form.Field>
      <Button type="submit">Submit</Button>
    </Form>

      </Grid.Column>
      <Grid.Column width={4}>
      </Grid.Column>
    </Grid.Row>
  </Grid>
  );
}
